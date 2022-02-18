package com.example.demo.spring.image.jobs

import com.example.demo.spring.image.tasklets.TutorialTasklet
import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class TutorialConfig (
    private val jobBuilderFactory: JobBuilderFactory,
    private val stepBuilderFactory: StepBuilderFactory,
) {

    @Bean
    fun tutorialJob(): Job {
        return jobBuilderFactory["tutorialJob"]
            .start(tutorialStep()) // Step 설정
            .build()
    }

    // StepBuilderFactory를 통해서 tutorialStep을 생성
    @Bean
    fun tutorialStep(): Step {
        return stepBuilderFactory["tutorialStep"]
            .tasklet(TutorialTasklet()) // Tasklet 설정
            .build()
    }
}
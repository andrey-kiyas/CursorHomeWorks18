package com.CursorHomeWorks18.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.CursorHomeWorks18.config.Constants.TOPIC_NAME1;
import static com.CursorHomeWorks18.config.Constants.TOPIC_NAME2;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic cursorTopic() {
        return TopicBuilder.name(TOPIC_NAME1)
            .build();
    }

    @Bean
    public NewTopic cursorTopic2() {
        return TopicBuilder.name(TOPIC_NAME2)
            .build();
    }
}

package com.CursorHomeWorks18.consumer;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.kafka.annotation.KafkaListener;

import static com.CursorHomeWorks18.config.Constants.TOPIC_NAME1;
import static com.CursorHomeWorks18.config.Constants.TOPIC_NAME2;
import static com.CursorHomeWorks18.config.KafkaTopicConfig.GROUP_ID;

public class KafkaConsumer {
    private static final Log log = LogFactory.getLog(KafkaConsumer.class);

    @KafkaListener(topics = TOPIC_NAME1, groupId = GROUP_ID)
    public void consume(String message) {
        log.info(String.format("$$ -> Consumed Message -> %s", message));
    }

    @KafkaListener(topics = TOPIC_NAME2, groupId = GROUP_ID)
    public void consume2(String message) {
        log.info(String.format("$$ -> Consumed Message -> %s", message));
    }
}

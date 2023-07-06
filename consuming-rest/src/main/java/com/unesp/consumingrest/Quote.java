package com.unesp.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.env.ConfigTreePropertySource;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote (String type, Value value) {
}

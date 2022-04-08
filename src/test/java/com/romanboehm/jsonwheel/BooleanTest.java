package com.romanboehm.jsonwheel;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;

import static org.junit.jupiter.api.Named.named;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BooleanTest extends JsonWheelTestMatrix {

    @Override
    List<Arguments> args() {
        return List.of(
                arguments(named("true", new Arg("true", true))),
                arguments(named("false", new Arg("false", false)))
        );
    }
}

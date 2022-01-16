package hu.lock.controller;

import hu.lock.model.domain.Key;

import java.util.List;
import java.util.stream.Collectors;

public class KeyService {

    private final List<Key> keys;

    public KeyService(List<Key> keys) {
        this.keys = keys;

    }

    public String getEqualKeyIds(String pattern) {
        return keys.stream()
                .filter(i -> i.getValue().equals(pattern))
                .map(Key::getId)
                .map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}
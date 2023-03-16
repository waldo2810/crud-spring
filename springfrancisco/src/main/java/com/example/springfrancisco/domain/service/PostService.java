package com.example.springfrancisco.domain.service;

public interface PostService<T> {
  T save(T type);
}

package com.example.almgroupproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Jesper Friberg Spång
 * Date: 2021-05-17
 * Time: 14:18
 * Project: almGroupProject
 * Copyright: MIT
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Review {
    private String comment;
    private int rating;
}

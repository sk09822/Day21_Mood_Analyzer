package com.blz.day19;

public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer() {
    }

    public String analyseMood(String i_am_in_any_mood) {
        if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        }


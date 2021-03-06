package com.rs.game.player.quests;

/**
 * Created by Peng on 30.1.2017 15:56.
 */
public class QuestData {

    private final String name;
    private final int questId;
    private final int configType;
    private final int progressConfig;
    private final int completedValue;

    public QuestData(String name, int questId, int progressConfig, int completedValue, int configType) {
        this.name = name;
        this.questId = questId;
        this.progressConfig = progressConfig;
        this.completedValue = completedValue;
        this.configType = configType;
    }

    int getCompletedConfig() {
        return completedValue;
    }

    int getProgressConfig() {
        return progressConfig;
    }

    int getQuestId() {
        return questId;
    }

    @Override
    public String toString() {
        return "QuestData{" + "name='" + name + '\'' + ", questId=" + questId + ", progressConfig=" + progressConfig
               + ", completedValue=" + completedValue + '}';
    }

    int getConfigType() {
        return configType;
    }

    public String getName() {
        return name;
    }
}

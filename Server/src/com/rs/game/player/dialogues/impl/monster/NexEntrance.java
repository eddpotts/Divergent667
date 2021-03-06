package com.rs.game.player.dialogues.impl.monster;

import com.rs.game.world.WorldTile;
import com.rs.game.minigames.ZarosGodwars;
import com.rs.game.player.dialogues.Dialogue;

public final class NexEntrance extends Dialogue {

    @Override
    public void start() {
        sendText("The room beyond this point is a prison! There is no way out other than death or teleport. Only " +
                "those who endure dangerous encounters should proceed.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (stage == -1) {
            stage = 0;
            sendOptions("There are currently " + ZarosGodwars.getPlayersCount() + " people fighting" + ".<br>Do you "
                    + "wish to join them?", "Climb down.", "Stay here.");
        } else if (stage == 0) {
            if (componentId == 1) {
                player.setNextWorldTile(new WorldTile(2911, 5204, 0));
                player.getControllerManager().startController("ZGDController");
            }
            end();
        }

    }

    @Override
    public void finish() {
    }

}

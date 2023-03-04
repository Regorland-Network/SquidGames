package net.regorland.squidgames.game;

import net.regorland.squidgames.SquidGames;
import net.regorland.squidgames.arena.Arena;
import org.bukkit.Location;

import java.util.StringJoiner;

public abstract class BaseGame implements GameActions {
    protected final Arena arena;

    protected final Location spawnLocation;

    public BaseGame(Arena arena) {
        this.arena = arena;

        this.spawnLocation = SquidGames.getInstance().getLocationsConfiguration().getLocation(
                new StringJoiner(".").add("games").add("spawn").add(arena.getGameType().getIdentifier()).toString());
    }
}

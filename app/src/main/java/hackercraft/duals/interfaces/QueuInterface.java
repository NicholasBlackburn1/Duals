package hackercraft.duals.interfaces;


import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.entity.Player;

/**
 * Represents a Queue loaded on the server.
 */
public interface QueuInterface {

    /**
     * The {@link Kit} set for this {@link QueuInterface}.
     *
     * @return {@link Kit} set for this {@link QueuInterface} or null if no kit was
     *         set.
     */
    @Nullable
    KitInterface getKit();

    /**
     * The bet amount for this {@link QueuInterface}.
     *
     * @return Bet amount for this {@link QueuInterface} or 0 if no bet was
     *         specified.
     */
    int getBet();

    /**
     * Whether or not the given {@link Player} is in this {@link QueuInterface}.
     *
     * @param player Player to check if in this {@link QueuInterface}. Must not be
     *               null!
     * @return True if player is in this {@link QueuInterface}. False otherwise.
     */
    boolean isInQueue(@Nonnull final Player player);

    /**
     * An UnmodifiableList of {@link Player}s in this queue.
     *
     * @return Never-null UnmodifiableList of {@link Player}s in this queue.
     */
    @Nonnull
    List<Player> getQueuedPlayers();

    /**
     * Whether or not this {@link QueuInterface} has been removed.
     *
     * @return True if this {@link QueuInterface} has been removed. False otherwise.
     * @see DQueueManager#remove(Kit, int)
     */
    boolean isRemoved();
}
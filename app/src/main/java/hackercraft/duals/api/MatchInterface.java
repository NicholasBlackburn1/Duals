package hackercraft.duals.api;

import java.util.List;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import me.realized.duels.api.arena.Arena;
import me.realized.duels.api.kit.Kit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Represents an ongoing Match.
 */
public interface MatchInterface {

    /**
     * The {@link Arena} this {@link MatchInterface} is taking place in.
     *
     * @return {@link Arena} this {@link MatchInterface} is taking place in.
     */
    @Nonnull
    ArenaInterface getArena();

    /**
     * The start of this match {@link MatchInterface} milliseconds. Note:
     * {@link System#currentTimeMillis()} subtracted by the result of this method
     * will give the duration of the current {@link MatchInterface} in milliseconds.
     *
     * @return start of this match in milliseconds.
     */
    long getStart();

    /**
     * The {@link Kit} used in this {@link MatchInterface}.
     *
     * @return {@link Kit} used in this {@link MatchInterface} or null if players
     *         are using their own inventories.
     */
    @Nullable
    Kit getKit();

    /**
     * UnmodifiableList of ItemStacks the player has bet for this
     * {@link MatchInterface}.
     *
     * @param player {@link Player} to get the list of bet items.
     * @return Never-null UnmodifiableList of ItemStacks the player has bet for this
     *         {@link MatchInterface}.
     */
    @Nonnull
    List<ItemStack> getItems(@Nonnull final Player player);

    /**
     * The bet amount for this {@link MatchInterface}.
     *
     * @return bet Bet amount for this {@link MatchInterface} or 0 if no bet was
     *         specified.
     */
    int getBet();

    /**
     * Whether or not this {@link MatchInterface} is finished.
     *
     * @return true if this {@link MatchInterface} has finished or false otherwise.
     * @since 3.4.1
     */
    boolean isFinished();

    /**
     * UnmodifiableSet of alive players in this {@link MatchInterface}.
     *
     * @return Never-null UnmodifiableSet of alive players in this
     *         {@link MatchInterface}.
     * @since 3.1.0
     */
    @Nonnull
    Set<Player> getPlayers();

    /**
     * UnmodifiableSet of players who started this {@link MatchInterface}. Note:
     * This set includes players who are offline. If you keep a reference to this
     * match, all the player objects of those who started this match will not be
     * garbage-collected.
     *
     * @return Never-null UnmodifiableSet of players who started this
     *         {@link MatchInterface}.
     * @since 3.4.1
     */
    @Nonnull
    Set<Player> getStartingPlayers();
}
package hackercraft.duals.interfaces;

import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Represents the KitManager singleton used by Duels.
 */
public interface KitManagerInterface {

    /**
     * Attempts to find an {@link Kit} instance associated with the given name.
     *
     * @param name Name to search through the loaded kits. Should not be null!
     * @return {@link Kit} instance that has a name matching with the given name or null if not exists.
     */
    @Nullable
    KitInterface get(@Nonnull final String name);


    /**
     * Creates a KitInterface with given name and {@link Player}'s inventory contents.
     * Note: Calls {@link KitInterfaceCreateEvent} on successful creation.
     *
     * @param creator {@link Player} who is the creator of this KitInterface.
     * @param name Name of the newly created {@link KitInterface}. Requires to be alphanumeric (underscore is allowed).
     * @return The newly created {@link KitInterface} or null if a KitInterface with given name already exists.
     */
    @Nullable
    KitInterface create(@Nonnull final Player creator, @Nonnull final String name);


    /**
     * Removes a kit with given name.
     * Note: Calls {@link KitRemoveEvent} on successful removal.
     *
     * @param source {@link CommandSender} who is the source of this call.
     * @param name Name of the kit to remove.
     * @return The removed {@link KitInterface} or null if no {@link KitInterface} was found with the given name.
     */
    @Nullable
    KitInterface remove(@Nullable CommandSender source, @Nonnull final String name);


    /**
     * Calls {@link #remove(CommandSender, String)} with source being null.
     *
     * @see #remove(CommandSender, String)
     */
    @Nullable
    KitInterface remove(@Nonnull final String name);


    /**
     * An UnmodifiableList of {@link KitInterface}s that are currently loaded.
     *
     * @return Never-null UnmodifiableList of {@link KitInterface}s that are currently loaded.
     * @since 3.1.0
     */
    @Nonnull
    List<KitInterface> getKits();
}
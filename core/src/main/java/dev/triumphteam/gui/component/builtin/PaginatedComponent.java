package dev.triumphteam.gui.component.builtin;

import dev.triumphteam.gui.component.GuiComponent;
import dev.triumphteam.gui.state.State;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class PaginatedComponent<P, I> implements GuiComponent<P, I> {

    @Override
    public @NotNull List<@NotNull State> states() {
        return List.of();
    }


}

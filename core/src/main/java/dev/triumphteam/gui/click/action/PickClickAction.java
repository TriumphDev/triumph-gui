package dev.triumphteam.gui.click.action;

import dev.triumphteam.gui.click.ClickContext;
import dev.triumphteam.gui.click.GuiClick;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface PickClickAction<P> extends GuiClickAction<P> {

    @NotNull GuiClick.Result run(final @NotNull P player, final @NotNull ClickContext context);
}

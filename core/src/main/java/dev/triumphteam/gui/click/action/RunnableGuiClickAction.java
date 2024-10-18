/**
 * MIT License
 *
 * Copyright (c) 2024 TriumphTeam
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package dev.triumphteam.gui.click.action;

import dev.triumphteam.gui.click.ClickContext;
import dev.triumphteam.gui.click.handler.CompletableFutureClickHandler;
import dev.triumphteam.gui.click.handler.SimpleClickHandler;
import org.jetbrains.annotations.NotNull;

/**
 * The main/default click action type.
 * A simple {@link Runnable} like functional interface.
 * This is by default handled by {@link CompletableFutureClickHandler} and {@link SimpleClickHandler}.
 *
 * @param <P> The player type.
 * @see SimpleClickHandler
 * @see CompletableFutureClickHandler
 */
@FunctionalInterface
public interface RunnableGuiClickAction<P> extends GuiClickAction<P> {

    /**
     * Run the click action.
     *
     * @param player  The instance of the player clicking on the GUI.
     * @param context The click context.
     */
    void run(final @NotNull P player, final @NotNull ClickContext context);
}
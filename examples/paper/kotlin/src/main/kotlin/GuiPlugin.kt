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
package dev.triumphteam.gui.example

import dev.triumphteam.gui.example.examples.CookieClicker
import dev.triumphteam.gui.example.examples.Paginated
import dev.triumphteam.gui.example.examples.Scrolling
import dev.triumphteam.gui.example.examples.Static
import dev.triumphteam.gui.example.examples.UpdatingTitle
import org.bukkit.plugin.java.JavaPlugin

public class GuiPlugin : JavaPlugin() {

    override fun onEnable() {
        getCommand("gui-static")?.setExecutor(Static())
        getCommand("gui-clicker")?.setExecutor(CookieClicker())
        getCommand("gui-title")?.setExecutor(UpdatingTitle())
        getCommand("gui-page")?.setExecutor(Paginated())
        getCommand("gui-scroll")?.setExecutor(Scrolling())
    }
}

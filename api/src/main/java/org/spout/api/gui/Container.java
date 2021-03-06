/*
 * This file is part of Spout.
 *
 * Copyright (c) 2011 Spout LLC <http://www.spout.org/>
 * Spout is licensed under the Spout License Version 1.
 *
 * Spout is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * Spout is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
package org.spout.api.gui;

import java.util.Collection;

import org.spout.api.math.IntVector2;
import org.spout.api.plugin.Plugin;

/**
 * Represents something that contains {@link Widget}s.
 */
public interface Container {
	/**
	 * Removes all widgets on the screen.
	 */
	public abstract void removeWidgets();

	/**
	 * Removes all widgets registered under the specified plugin.
	 *
	 * @param plugin to remove widgets from
	 */
	public abstract void removeWidgets(Plugin plugin);

	/**
	 * Removes the specified widgets from this screen.
	 *
	 * @param widgets to remove
	 */
	public abstract void removeWidgets(Widget... widgets);

	/**
	 * Removes the specified widget.
	 *
	 * @param widget to remove
	 */
	public abstract void removeWidget(Widget widget);

	/**
	 * Attaches the specified widget to the screen registered under the specified plugin.
	 *
	 * @param plugin to register widget under
	 * @param widget to attach
	 */
	public abstract void attachWidget(Plugin plugin, Widget widget);

	/**
	 * Returns a collection of all widgets.
	 *
	 * @return all widgets
	 */
	public abstract Collection<Widget> getWidgets();

	/**
	 * Returns a widget at the specified location.
	 *
	 * @param x position of widget
	 * @param y position of widget
	 * @return widget at x, y
	 */
	public abstract Widget getWidgetAt(int x, int y);

	/**
	 * Returns a widget at the specified location.
	 *
	 * @param pos position of widget
	 * @return widget at specified position
	 */
	public abstract Widget getWidgetAt(IntVector2 pos);
}

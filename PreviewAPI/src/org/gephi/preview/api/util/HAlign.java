/*
Copyright 2008-2010 Gephi
Authors : Jeremy Subtil <jeremy.subtil@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.gephi.preview.api.util;

/**
 * Interface providing methods to render an horizontal alignment for different
 * supports.
 *
 * @author Jérémy Subtil <jeremy.subtil@gephi.org>
 */
public interface HAlign {

    /**
     * Formats the alignment for a Processing target.
     *
     * @return the formatted alignment
     */
    public int toProcessing();

    /**
     * Formats the alignment for a CSS target.
     *
     * @return the formatted alignment
     */
    public String toCSS();

    /**
     * Formats the alignment for an iText target.
     *
     * @return the formatted alignment
     */
    public int toIText();
}

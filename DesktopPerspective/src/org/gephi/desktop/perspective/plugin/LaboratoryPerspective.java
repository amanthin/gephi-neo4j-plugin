/*
Copyright 2008-2010 Gephi
Authors : Mathieu Bastian <mathieu.bastian@gephi.org>
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
package org.gephi.desktop.perspective.plugin;

import javax.swing.Icon;
import org.gephi.desktop.perspective.spi.Perspective;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Mathieu Bastian
 */
@ServiceProvider(service = Perspective.class, position = 200)
public class LaboratoryPerspective implements Perspective {

    @Override
    public Icon getIcon() {
        return ImageUtilities.loadImageIcon("org/gephi/desktop/perspective/plugin/resources/laboratory.png", false);
    }

    @Override
    public String getDisplayName() {
        return NbBundle.getMessage(PreviewPerspective.class, "LaboratoryPerspective.name");
    }

    @Override
    public String getName() {
        return "LaboratoryGroup";
    }
}

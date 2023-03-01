import org.pdfsam.model.tool.Tool;
import org.pdfsam.tools.alternatemix.AlternateMixTool;

/*
 * This file is part of the PDF Split And Merge source code
 * Created on 03/10/22
 * Copyright 2022 by Sober Lemur S.r.l. (info@pdfsam.org).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
module org.pdfsam.tools.alternatemix {
    exports org.pdfsam.tools.alternatemix;

    requires org.pdfsam.core;
    requires org.pdfsam.ui.components;
    requires org.pdfsam.i18n;
    requires transitive org.pdfsam.model;
    requires jakarta.inject;
    requires javafx.graphics;
    requires org.pdfsam.eventstudio;
    requires org.pdfsam.injector;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.unicons;
    requires org.slf4j;

    provides Tool with AlternateMixTool;
}
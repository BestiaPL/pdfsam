import org.pdfsam.theme.Dark;
import org.pdfsam.theme.DarkTeal;
import org.pdfsam.theme.Light;
import org.pdfsam.theme.LightBlue;
import org.pdfsam.theme.Theme;

/*
 * This file is part of the PDF Split And Merge source code
 * Created on 16/09/22
 * Copyright 2022 by Sober Lemur S.a.s. di Vacondio Andrea (info@pdfsam.org).
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
module org.pdfsam.themes {
    exports org.pdfsam.theme;

    requires org.pdfsam.i18n;
    provides Theme with Light, Dark, LightBlue, DarkTeal;

    opens themes.light;
    opens themes.dark;
    opens themes.lightblue;
    opens themes.darkteal;
}
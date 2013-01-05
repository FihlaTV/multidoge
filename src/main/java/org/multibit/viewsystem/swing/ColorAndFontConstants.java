/**
 * Copyright 2012 multibit.org
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.multibit.viewsystem.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.UIManager;

/***
 * Class containing constants for the colors and fonts used as default in MultiBit
 * @author jim
 *
 */
public class ColorAndFontConstants {
    public static String MULTIBIT_DEFAULT_FONT_NAME; 
    public static int MULTIBIT_DEFAULT_FONT_STYLE; 
    public static int MULTIBIT_DEFAULT_FONT_SIZE;
    public static int MULTIBIT_LARGE_FONT_INCREASE = 1;

    public static Color BACKGROUND_COLOR;
    public static Color DARK_BACKGROUND_COLOR;
    public static Color VERY_LIGHT_BACKGROUND_COLOR = new Color(250, 250, 253);

    public static Color SELECTION_FOREGROUND_COLOR = SystemColor.textHighlightText;
    public static Color SELECTION_BACKGROUND_COLOR = SystemColor.textHighlight;
    
    public static Color CREDIT_FOREGROUND_COLOR = Color.GREEN.darker().darker();
    public static Color DEBIT_FOREGROUND_COLOR = Color.RED.darker();
    public static Color SELECTION_CREDIT_FOREGROUND_COLOR = SystemColor.textHighlightText;
    public static Color SELECTION_DEBIT_FOREGROUND_COLOR = SystemColor.textHighlightText;
    
    public static Color ALTERNATE_TABLE_COLOR = new Color(230, 230, 233);
    
    public static Color SEAGLASS_BLUE = new Color(237, 246, 252);
    public static Color SEAGLASS_BACKGROUND = new Color(249, 249, 252);
    
    public static void init() {
        MULTIBIT_DEFAULT_FONT_NAME =   UIManager.get("Label.font") == null ? Font.DIALOG : ((Font)UIManager.get("Label.font")).getFontName();
        MULTIBIT_DEFAULT_FONT_STYLE =  UIManager.get("Label.font") == null ? 0 : ((Font)UIManager.get("Label.font")).getStyle();
        MULTIBIT_DEFAULT_FONT_SIZE = UIManager.get("Label.font") == null ? 13 : ((Font)UIManager.get("Label.font")).getSize() + 1;

        BACKGROUND_COLOR =  UIManager.get("Label.background") == null ?  new Color(250, 250, 253) : (Color) UIManager.get("Label.background");
        DARK_BACKGROUND_COLOR = BACKGROUND_COLOR.darker();
    }
}

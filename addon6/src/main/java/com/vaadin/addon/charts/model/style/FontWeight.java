package com.vaadin.addon.charts.model.style;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2012 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 2.0
 * (CVALv2).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv2 along with this program.
 * If not, see <http://vaadin.com/license/cval-2.0>.
 * #L%
 */

import com.vaadin.addon.charts.model.ChartEnum;

/**
 * Font weight used by Style class
 */
public enum FontWeight implements ChartEnum {

    /**
     * Normal text
     */
    NORMAL("normal"),

    /**
     * Bold text
     */
    BOLD("bold");

    private String type;

    private FontWeight(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

}
package org.aaronquitech.project.dependecy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 * @author Aaron Quinonez
 * @since 31/01/2025
 */
@Getter
@Setter
@AllArgsConstructor
public class DataContainer {
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<Character> results;
}

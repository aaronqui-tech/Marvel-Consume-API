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
public class StoryList {
    private int available;
    private String collectionURI;
    private List<StorySummary> items;
    private int returned;
}

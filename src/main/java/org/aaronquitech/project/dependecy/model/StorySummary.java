package org.aaronquitech.project.dependecy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Aaron Quinonez
 * @since 31/01/2025
 */
@Getter
@Setter
@AllArgsConstructor
public class StorySummary {
    private String resourceURI;
    private String name;
    private String type;
}

package org.aaronquitech.project.dependecy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.aaronquitech.project.dependecy.model.common.CommonAppearances;

import java.util.List;

/**
 *
 * @author Aaron Quinonez
 * @since 31/01/2025
 */
@Getter
@Setter
@AllArgsConstructor
public class Character {
    private int id;
    private String name;
    private String description;
    private String modified;
    private Thumbnail thumbnail;
    private String resourceURI;
    private CommonAppearances comics;
    private CommonAppearances series;
    private StoryList stories;
    private CommonAppearances events;
    private List<Url> urls;
}

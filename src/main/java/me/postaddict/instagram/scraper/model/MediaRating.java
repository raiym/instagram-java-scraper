package me.postaddict.instagram.scraper.model;

import lombok.Data;
import lombok.ToString;

import java.util.Collection;

@Data
@ToString
public class MediaRating {
    private PageObject<me.postaddict.instagram.scraper.domain.Media> media;//media": {"nodes"
    private Collection<Media> topPosts;//"top_posts": {"nodes": [
}
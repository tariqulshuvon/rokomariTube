package com.rokomari.rokomariTube.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "video")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String url;

    @Column
    private Long uploaderId;

    @Column
    private Long viewCount;

    @Column
    private Long likeCount;

    @Column
    private Long dislikeCount;
}

package khu.bigdata.infou.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;


public class LectureResponseDTO {


    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CategoryRecommendLectureInfo {

        private int lectureId;
        private float avgRating;
        private String thumbnail;
        private String title;
        private float price;
        private String instructorName;

        private String topword1;
        private String topword2;

    }


    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CategoryRecommendLectureDto {

        List<CategoryRecommendLectureInfo> lectureList;
    }


    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class KeywordRecommendLectureInfo {

        private int lectureId;
        private float avgRating;
        private String thumbnail;
        private String title;
        private float price;
        private String instructorName;

        private String topword1;
        private String topword2;
    }


    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class KeywordRecommendLectureDto {

        List<KeywordRecommendLectureInfo> lectureList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LectureDetailDto {

        private int lectureId;
        private float avgRating;
        private String thumbnail;
        private String title;
        private float price;
        private String instructorName;
        private String category;
        private String subcategory;

        private Integer good;
        private Integer bad;
        private float teaching_quality;
        private float reference;
        private float practice;
        private float rating;
        private float level;

        private String topword1; // topic
        private String topword2; // subcategory
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OtherStudentsDto {

        private String userId;
        private String name;
        private String topword1;    // topic
        private String topword2;    // subcategory
        private String topword3;    // (title + description) 가장 많이 나오는 단어

    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OtherLectureListInfo {

        private int lectureId;
        private float avgRating;
        private String thumbnail;
        private String title;
        private float price;
        private String instructorName;

        private String topword1;
        private String topword2;
        private String topword3;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OtherLectureListDto {

        // 강의 분석 관련
        private String userId;
        private String name;
        private String topword1;
        private String topword2;
        private String topword3;

        private List<OtherLectureListInfo> lectureList; // 강의 정보 관련
    }


}

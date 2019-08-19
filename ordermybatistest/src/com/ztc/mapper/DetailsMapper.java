package com.ztc.mapper;

import com.ztc.entity.Details;

import java.util.List;

public interface DetailsMapper {
    int insertDetails(Details details);

    List<Details> selectDetails(String detailsId);

    int updateDetails(Details details);

    int deleteDetails(String detailsId);
}

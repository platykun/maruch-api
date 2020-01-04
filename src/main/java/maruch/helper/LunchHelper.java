package maruch.helper;

import maruch.domain.Lunch;
import maruch.domain.LunchDetail;
import maruch.domain.value.IntegerRangeValue;
import maruch.domain.value.LunchSearchValue;
import maruch.domain.value.SearchPropertiesValue;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * swaggerオブジェクトとドメインオブジェクトを変換する
 */
public class LunchHelper {

    /**
     * ランチ情報を検索するためのmodelを作成する.
     *
     * @param req 検索条件
     * @return 検索条件model
     */
    public static LunchSearchValue convertLunchSearchValueToModel(
            maruch.swagger.api.model.LunchListSearchProperties req
    ) {

        maruch.swagger.api.model.SearchProperties reqSearchProperties = req.getPage();
        SearchPropertiesValue spv = SearchPropertiesValue.create(reqSearchProperties.getCount().intValue(), reqSearchProperties.getCursor().intValue());

        List<LunchSearchValue.SortEnum> sortList =
                req.getSort().stream()
                        .map(s -> LunchSearchValue.SortEnum.valueOf(s.toString()))
                        .collect(Collectors.toList());

        maruch.swagger.api.model.IntegerRange valueRange = req.getPrice();
        IntegerRangeValue value = IntegerRangeValue.create(valueRange.getMin(), valueRange.getMax());

        maruch.swagger.api.model.IntegerRange lipidRange = req.getLipid();
        IntegerRangeValue lipid = IntegerRangeValue.create(lipidRange.getMin(), lipidRange.getMax());

        return LunchSearchValue.create(spv, sortList, value, lipid);
    }

    public static Lunch convertRequestToModel(
            maruch.swagger.api.model.Lunch lunch) {

        maruch.swagger.api.model.LunchDetail detail = lunch.getDetail();
        LunchDetail lunchDetailModel = LunchDetail.create(
                lunch.getId(),
                detail.getCalorie().intValue(),
                detail.getDescription(),
                detail.getFiber().floatValue(),
                detail.getLabel(),
                detail.getLipid().floatValue(),
                detail.getProtein().floatValue(),
                detail.getSalt().floatValue()
        );


        return Lunch.create(
                lunch.getId(),
                lunch.getImageUrl(),
                lunch.getCreator().getId(),
                lunch.getShop().getId(),
                lunch.getPrice()
        ).addDetail(lunchDetailModel);
    }

    public static maruch.swagger.api.model.Lunch convertModelToResultLunch(Lunch lunch) {
        LunchDetail lunchDetail = lunch.getLunchDetail();
        maruch.swagger.api.model.LunchDetail targetDetail = new maruch.swagger.api.model.LunchDetail();
        targetDetail.setCalorie(BigDecimal.valueOf(lunchDetail.getCalorie()));
        targetDetail.setDescription(lunchDetail.getDescription());
        targetDetail.setFiber(BigDecimal.valueOf(lunchDetail.getFiber()));
        targetDetail.setLabel(lunchDetail.getLabel());
        targetDetail.setLipid(BigDecimal.valueOf(lunchDetail.getLipid()));
        targetDetail.setProtein(BigDecimal.valueOf(lunchDetail.getProtein()));
        targetDetail.setSalt(BigDecimal.valueOf(lunchDetail.getSalt()));

        maruch.swagger.api.model.Lunch target = new maruch.swagger.api.model.Lunch();
        target.setId(lunch.getId());
        target.setImageUrl(lunch.getImageUrl());
        target.setCreator(null);
        target.setShop(null);
        target.setPrice(lunch.getPrice());
        target.setDetail(targetDetail);

        return target;
    }

}

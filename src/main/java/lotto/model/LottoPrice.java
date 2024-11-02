package lotto.model;

import lotto.common.ExceptionConstant;
import lotto.common.LottoConstant;

public record LottoPrice(int price) {
    public LottoPrice {
        validateRange(price);
        validateUnit(price);
    }

    private void validateRange(int price) {
        if (price < LottoConstant.MIN_LOTTO_PRICE) {
            throw new IllegalArgumentException(ExceptionConstant.ERROR_MESSAGE + ExceptionConstant.LOTTO_PRICE_MESSAGE + LottoConstant.MIN_LOTTO_PRICE + "원 이상이어야 합니다.");
        }
    }

    private void validateUnit(int price) {
        if (price % LottoConstant.LOTTO_PRICE != 0) {
            throw new IllegalArgumentException(ExceptionConstant.ERROR_MESSAGE + ExceptionConstant.LOTTO_PRICE_MESSAGE + LottoConstant.LOTTO_PRICE + "원 단위여야 합니다.");
        }
    }
}

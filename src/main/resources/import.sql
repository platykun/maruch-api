
-- ユーザ
DROP TABLE APP_USER IF EXISTS;
CREATE TABLE IF NOT EXISTS APP_USER ( ID INT NOT NULL AUTO_INCREMENT, USER_NAME VARCHAR(20) NOT NULL , SEX VARCHAR(20) NOT NULL);


-- お気に入り
DROP TABLE FAVORITE IF EXISTS;
CREATE TABLE IF NOT EXISTS FAVORITE ( USER_ID INT NOT NULL, LUNCH_ID INT NOT NULL, FAVORITE_DATE DATE, PRIMARY KEY(USER_ID, LUNCH_ID));

-- ランチ詳細情報
DROP TABLE LUNCH_DETAIL IF EXISTS;
CREATE TABLE IF NOT EXISTS LUNCH_DETAIL ( LUNCH_ID INT NOT NULL AUTO_INCREMENT, CALORIE INT, CARBOHYDRATE INT, DESCRIPTION VARCHAR(256), FIBER NUMBER, LABEL VARCHAR(256), LIPID NUMBER, PROTEIN NUMBER, SALT NUMBER);

-- ランチ情報
DROP TABLE LUNCH IF EXISTS;
CREATE TABLE IF NOT EXISTS LUNCH ( ID INT NOT NULL AUTO_INCREMENT, IMAGE_URL VARCHAR(20), AUTHOR INT , SHOP_ID INT, PRICE INT);


-- 店舗情報
DROP TABLE SHOP IF EXISTS;
CREATE TABLE IF NOT EXISTS SHOP ( ID INT NOT NULL AUTO_INCREMENT, NAME VARCHAR(20), NAME_KANA VARCHAR(20), TEL VARCHAR(20), ADDRESS VARCHAR(256), OPEN_TIME VARCHAR(256), HOLIDAY VARCHAR(256), URL VARCHAR(256));

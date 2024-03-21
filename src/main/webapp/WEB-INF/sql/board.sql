-- oracle 계정 생성
	spring / 1234
	
	
	
sqlDevloper spring / 1234 로 로그인
-- table 생성

	CREATE TABLE BOARD
	(
		BNO       NUMBER(8)        PRIMARY KEY
	  , TITLE     VARCHAR2(240)    NOT NULL
	  , CONTENT   VARCHAR2(4000)  
	  , WRITER    VARCHAR2(12)
	  , REGDATE   DATE             DEFAULT SYSDATE
	  , HIT       NUMBER(9)        DEFAULT 0      
	  
	)
	
	
	CREATE SEQUENCE SEQ_BNO;

	INSERT INTO BOARD (BNO, TITLE, CONTENT, WRITER )
	 VALUES (SEQ_BNO.NEXTVAL, '새글', 'HELLO', '글쓴이1')
	INSERT INTO BOARD (BNO, TITLE, CONTENT, WRITER )
	 VALUES (SEQ_BNO.NEXTVAL, '두번째글', 'HI', '글쓴이2') 
	 
	 COMMIT;
	 
	 
	
-- 코드를 작성해주세요
WITH RECURSIVE GENERATION AS 
    (SELECT ID, PARENT_ID, 1 AS GEN_NUM
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL
    UNION ALL
     SELECT E.ID, E.PARENT_ID , GEN_NUM + 1 AS GEN_NUM
     FROM ECOLI_DATA E
     JOIN GENERATION G ON E.PARENT_ID = G.ID
    )

SELECT COUNT(*) AS COUNT, GEN_NUM AS GENERATION
FROM GENERATION
WHERE ID IN (SELECT ID
            FROM ECOLI_DATA
            WHERE ID NOT IN (SELECT DISTINCT C.ID
                            FROM ECOLI_DATA C, ECOLI_DATA P
                            WHERE C.ID = P.PARENT_ID))
GROUP BY GEN_NUM
ORDER BY GENERATION
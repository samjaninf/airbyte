package io.airbyte.integrations.destination.bigquery;

import com.google.common.collect.ImmutableList;
import java.util.List;

/**
 * NOTE: This class is not used, but is created for completeness.
 * See https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical#reserved_keywords
 * Copied from https://github.com/airbytehq/airbyte/blob/f226503bd1d4cd9c7412b04d47de584523988443/airbyte-integrations/bases/base-normalization/normalization/transform_catalog/reserved_keywords.py
 */
public class BigQueryReservedKeywords {

  public static final List<String> RESERVED_KEYWORDS = ImmutableList.of(
      "ALL",
      "AND",
      "ANY",
      "ARRAY",
      "AS",
      "ASC",
      "ASSERT_ROWS_MODIFIED",
      "AT",
      "BETWEEN",
      "BY",
      "CASE",
      "CAST",
      "COLLATE",
      "CONTAINS",
      "CREATE",
      "CROSS",
      "CUBE",
      "CURRENT",
      "CURRENT_DATE",
      "CURRENT_TIME",
      "CURRENT_TIMESTAMP",
      "DEFAULT",
      "DEFINE",
      "DESC",
      "DISTINCT",
      "ELSE",
      "END",
      "ENUM",
      "ESCAPE",
      "EXCEPT",
      "EXCLUDE",
      "EXISTS",
      "EXTRACT",
      "FALSE",
      "FETCH",
      "FOLLOWING",
      "FOR",
      "FROM",
      "FULL",
      "GROUP",
      "GROUPING",
      "GROUPS",
      "HASH",
      "HAVING",
      "IF",
      "IGNORE",
      "IN",
      "INNER",
      "INTERSECT",
      "INTERVAL",
      "INTO",
      "IS",
      "JOIN",
      "LATERAL",
      "LEFT",
      "LIKE",
      "LIMIT",
      "LOOKUP",
      "MERGE",
      "NATURAL",
      "NEW",
      "NO",
      "NOT",
      "NULL",
      "NULLS",
      "OF",
      "ON",
      "OR",
      "ORDER",
      "OUTER",
      "OVER",
      "PARTITION",
      "PRECEDING",
      "PROTO",
      "RANGE",
      "RECURSIVE",
      "RESPECT",
      "RIGHT",
      "ROLLUP",
      "ROWS",
      "SELECT",
      "SET",
      "SOME",
      "STRUCT",
      "TABLESAMPLE",
      "THEN",
      "TO",
      "TREAT",
      "TRUE",
      "UNBOUNDED",
      "UNION",
      "UNNEST",
      "USING",
      "WHEN",
      "WHERE",
      "WINDOW",
      "WITH",
      "WITHIN");

}

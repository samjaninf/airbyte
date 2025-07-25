# Easypromos
Airbyte connector for [Easypromos](https://www.easypromosapp.com/) enables seamless data extraction from Easypromos, an online platform for running contests, giveaways, and promotions. It facilitates automatic syncing of participant information, promotion performance, and engagement metrics into data warehouses, streamlining analytics and reporting. This integration helps businesses easily analyze campaign data and optimize marketing strategies

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `bearer_token` | `string` | Bearer Token.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| promotions | id | DefaultPaginator | ✅ |  ❌  |
| organizing_brands | id | DefaultPaginator | ✅ |  ❌  |
| stages | id | DefaultPaginator | ✅ |  ❌  |
| users | id | DefaultPaginator | ✅ |  ❌  |
| participations | id | DefaultPaginator | ✅ |  ❌  |
| prizes | id | DefaultPaginator | ✅ |  ❌  |
| rankings | id | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.31 | 2025-07-26 | [63955](https://github.com/airbytehq/airbyte/pull/63955) | Update dependencies |
| 0.0.30 | 2025-07-19 | [63535](https://github.com/airbytehq/airbyte/pull/63535) | Update dependencies |
| 0.0.29 | 2025-07-12 | [63005](https://github.com/airbytehq/airbyte/pull/63005) | Update dependencies |
| 0.0.28 | 2025-07-05 | [62787](https://github.com/airbytehq/airbyte/pull/62787) | Update dependencies |
| 0.0.27 | 2025-06-28 | [62348](https://github.com/airbytehq/airbyte/pull/62348) | Update dependencies |
| 0.0.26 | 2025-06-22 | [61987](https://github.com/airbytehq/airbyte/pull/61987) | Update dependencies |
| 0.0.25 | 2025-06-14 | [61241](https://github.com/airbytehq/airbyte/pull/61241) | Update dependencies |
| 0.0.24 | 2025-05-24 | [60370](https://github.com/airbytehq/airbyte/pull/60370) | Update dependencies |
| 0.0.23 | 2025-05-10 | [59996](https://github.com/airbytehq/airbyte/pull/59996) | Update dependencies |
| 0.0.22 | 2025-05-03 | [59381](https://github.com/airbytehq/airbyte/pull/59381) | Update dependencies |
| 0.0.21 | 2025-04-26 | [58893](https://github.com/airbytehq/airbyte/pull/58893) | Update dependencies |
| 0.0.20 | 2025-04-19 | [58364](https://github.com/airbytehq/airbyte/pull/58364) | Update dependencies |
| 0.0.19 | 2025-04-12 | [57792](https://github.com/airbytehq/airbyte/pull/57792) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57215](https://github.com/airbytehq/airbyte/pull/57215) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56516](https://github.com/airbytehq/airbyte/pull/56516) | Update dependencies |
| 0.0.16 | 2025-03-22 | [55968](https://github.com/airbytehq/airbyte/pull/55968) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55290](https://github.com/airbytehq/airbyte/pull/55290) | Update dependencies |
| 0.0.14 | 2025-03-01 | [54915](https://github.com/airbytehq/airbyte/pull/54915) | Update dependencies |
| 0.0.13 | 2025-02-22 | [54415](https://github.com/airbytehq/airbyte/pull/54415) | Update dependencies |
| 0.0.12 | 2025-02-15 | [53731](https://github.com/airbytehq/airbyte/pull/53731) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53381](https://github.com/airbytehq/airbyte/pull/53381) | Update dependencies |
| 0.0.10 | 2025-02-01 | [52846](https://github.com/airbytehq/airbyte/pull/52846) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52333](https://github.com/airbytehq/airbyte/pull/52333) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51626](https://github.com/airbytehq/airbyte/pull/51626) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51089](https://github.com/airbytehq/airbyte/pull/51089) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50586](https://github.com/airbytehq/airbyte/pull/50586) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50003](https://github.com/airbytehq/airbyte/pull/50003) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49477](https://github.com/airbytehq/airbyte/pull/49477) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49180](https://github.com/airbytehq/airbyte/pull/49180) | Update dependencies |
| 0.0.2 | 2024-11-04 | [48302](https://github.com/airbytehq/airbyte/pull/48302) | Update dependencies |
| 0.0.1 | 2024-10-21 | | Initial release by [@parthiv11](https://github.com/parthiv11) via Connector Builder |

</details>

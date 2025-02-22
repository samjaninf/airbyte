/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */
package io.airbyte.cdk.test.fixtures.legacy

import org.apache.commons.lang3.function.FailableBiConsumer

fun interface CheckedBiConsumer<T, R, E : Throwable?> : FailableBiConsumer<T, R, E>

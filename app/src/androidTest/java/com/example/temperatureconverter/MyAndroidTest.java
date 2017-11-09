package com.example.temperatureconverter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getContext;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by weihaoxu on 11/8/17.
 */

public class MyAndroidTest {
    @Test
    public void shouldContainsValidKVPair() throws Exception {
        String key = "key";
        String value = "value";
        Intent intent = ConverterUtil.getIntentWithExtra(getContext(), key, value);
        assertEquals(intent.getStringExtra(key), value);
    }



}

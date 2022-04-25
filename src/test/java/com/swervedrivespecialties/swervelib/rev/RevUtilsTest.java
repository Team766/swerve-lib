package com.swervedrivespecialties.swervelib.rev;

import com.revrobotics.REVLibError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RevUtilsTest {
    @Test
    void checkNeoError() {
        // NOTE(rcahoon, 2022-04-24): The library code was changed to report errors using DriverStation.reportError instead of throwing an exception,
        //     but this test seems not to have been updated. WPILibJ currently has no way of interrogating which errors were reported with reportError,
        //     so I'm just disabling these assertions for now.
        //assertThrows(RuntimeException.class, () -> RevUtils.checkNeoError(REVLibError.kError, ""));
        //assertThrows(RuntimeException.class, () -> RevUtils.checkNeoError(REVLibError.kCantFindFirmware, ""));
        assertDoesNotThrow(() -> RevUtils.checkNeoError(REVLibError.kOk, ""));
    }
}

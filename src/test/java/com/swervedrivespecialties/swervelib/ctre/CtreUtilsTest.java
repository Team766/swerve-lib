package com.swervedrivespecialties.swervelib.ctre;

import com.ctre.phoenix.ErrorCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CtreUtilsTest {
    @Test
    void checkNeoError() {
        // NOTE(rcahoon, 2022-04-24): The library code was changed to report errors using DriverStation.reportError instead of throwing an exception,
        //     but this test seems not to have been updated. WPILibJ currently has no way of interrogating which errors were reported with reportError,
        //     so I'm just disabling these assertions for now.
        //assertThrows(RuntimeException.class, () -> CtreUtils.checkCtreError(ErrorCode.GeneralError, ""));
        //assertThrows(RuntimeException.class, () -> CtreUtils.checkCtreError(ErrorCode.FirmVersionCouldNotBeRetrieved, ""));
        assertDoesNotThrow(() -> CtreUtils.checkCtreError(ErrorCode.OK, ""));
    }
}

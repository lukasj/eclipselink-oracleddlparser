/*
 * Copyright (c) 2011, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 */

// Contributors:
//     Mike Norman - June 10 2011, created DDL parser package
//     David McCann - July 2011, visit tests
package org.eclipse.persistence.tools.oracleddl.test.databasetypebuilder;

//javase imports
import java.sql.Connection;
import java.sql.SQLException;

//JUnit4 imports
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//testing imports
import org.eclipse.persistence.tools.oracleddl.test.AllTests;
import org.eclipse.persistence.tools.oracleddl.util.DatabaseTypeBuilder;
import static org.eclipse.persistence.tools.oracleddl.test.TestHelper.buildConnection;

@RunWith(Suite.class)
@SuiteClasses({
    AnchoredTypesResolutionTestSuite.class,
    ConstraintsTableDDLTestSuite.class,
    MixedCaseObjectTableTypeTestSuite.class,
    IOTTableDDLTestSuite.class,
    PackagewStronglyTypedCursorDDLTestSuite.class,
    ProcedureDDLTestSuite.class,
    TableDDLTestSuite.class,
    TransformsTestSuite.class,
    TypeResolutionTestSuite.class
  }
)
public class DatabaseTypeBuilderTestSuite {

    //shared JUnit fixtures
    static Connection conn = AllTests.conn;
    static DatabaseTypeBuilder dtBuilder = null;

    @BeforeClass
    public static void setUp() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            conn = buildConnection();
        }
        dtBuilder = new DatabaseTypeBuilder();
    }

}

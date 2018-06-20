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
package org.eclipse.persistence.tools.oracleddl.metadata;

import org.eclipse.persistence.tools.oracleddl.metadata.visit.DatabaseTypeVisitable;
import org.eclipse.persistence.tools.oracleddl.metadata.visit.DatabaseTypeVisitor;

public class RealType extends PrecisionType implements DatabaseTypeVisitable {

    public static final String TYPENAME = "REAL";
    static final long DEFAULT_PRECISON = 18;

    public RealType() {
        super(TYPENAME, 18);
    }

    public RealType(long precision) {
        super(TYPENAME, precision);
    }

    public RealType(long precision, long scale) {
        super(TYPENAME, precision, 0);
    }

    @Override
    public long getDefaultPrecision() {
        return DEFAULT_PRECISON;
    }

    @Override
    public boolean isRealType() {
        return true;
    }

    public void accept(DatabaseTypeVisitor visitor) {
        visitor.visit(this);
    }
}

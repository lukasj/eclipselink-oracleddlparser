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

public class BlobType extends SizedType implements DatabaseTypeVisitable {

    public static final String TYPENAME = "BLOB";
    static long DEFAULT_SIZE = 0l;

    public BlobType() {
        super(TYPENAME, DEFAULT_SIZE);
    }
    public BlobType(long size) {
        super(TYPENAME, size);
    }
    public BlobType(String typeName, long size) {
        super(typeName, size);
    }

    @Override
    public boolean isBlobType() {
        return true;
    }

    @Override
    public long getDefaultSize() {
        return DEFAULT_SIZE;
    }

    public void accept(DatabaseTypeVisitor visitor) {
        visitor.visit(this);
    }

}

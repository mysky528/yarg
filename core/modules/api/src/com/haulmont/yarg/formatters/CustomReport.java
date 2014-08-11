/*
 * Copyright 2013 Haulmont
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.haulmont.yarg.formatters;

import com.haulmont.yarg.structure.Report;
import com.haulmont.yarg.structure.BandData;

import java.util.Map;

/**
 * This interface may be implemented if you need custom formatting logic, not covered by and provided formatter
 * Example: you need to merge pdfs created by another reports
 */
public interface CustomReport {
    byte[] createReport(Report report, BandData rootBand, Map<String, Object> params);
}
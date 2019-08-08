
// Copyright 2015-2016 Stanford University
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package glade.constants.program;

import glade.constants.Files;
import glade.main.ProgramDataUtils.MultiFileProgramExamples;
import glade.main.ProgramDataUtils.ProgramData;
import glade.main.ProgramDataUtils.ProgramExamples;
import glade.main.ProgramDataUtils.ShellProgramData;
import glade.util.OracleUtils.IdentityWrapper;

public class MineData {
    public static final String MINE_EXE = "mine/mine-src/src/mine";
    public static final boolean MINE_IS_ERROR = true;

    public static final String MINE_EXTENSION = ".mine";
    public static final String MINE_EMPTY = "%%\n%%";

    public static final String MINE_NAME = "mine";
    public static final ProgramData MINE_DATA = new ShellProgramData(Files.FILE_PARAMETERS, MINE_EXE, MINE_IS_ERROR);
    public static final ProgramExamples MINE_EXAMPLES = new MultiFileProgramExamples(Files.FILE_PARAMETERS, MINE_NAME, MINE_EXTENSION, MINE_EMPTY, new IdentityWrapper());
}

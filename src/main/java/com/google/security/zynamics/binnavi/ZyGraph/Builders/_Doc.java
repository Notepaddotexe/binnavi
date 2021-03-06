// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.ZyGraph.Builders;

/**
 * This package contains classes for building the content of the visible nodes in graphs. Basically,
 * the classes in this package take the model of a graph and turn it into something that can be
 * displayed on screen.
 *
 * The primary class of this package is {@link ZyGraphBuilder}. This class in turn calls all the
 * other classes. However, if you want to rebuild individual components of a graph, you can also
 * call the other classes directly.
 */

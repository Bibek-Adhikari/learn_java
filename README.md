# learn_java - Flowcharts

## Hello World

```mermaid
flowchart TD
    A([Start]) --> B[/"Print 'Hello World!'"/]
    B --> C([End])
```

## Simple Interest

```mermaid
flowchart TD
    A([Start]) --> B["Declare p, t, r, SI"]
    B --> C[/"Enter Principal (p)"/]
    C --> D[/"Enter Time (t)"/]
    D --> E[/"Enter Rate (r)"/]
    E --> F["SI = (p * t * r) / 100"]
    F --> G[/"Display 'Simple Interest = ' + SI"/]
    G --> H([End])
```

## Area of Circle

```mermaid
flowchart TD
    A([Start]) --> B["Declare int r, double area"]
    B --> C[/"Enter radius of the circle (r)"/]
    C --> D["area = 3.14 * r * r"]
    D --> E[/"Display 'Area of Circle:' + area"/]
    E --> F([End])
```

# Program Execution (Step by Step)

## Simple Interest — execution trace (sample input: p=1000, t=2, r=5)

### Phase 1: Start & Declaration
| Step | Action | Variable State |
|------|--------|----------------|
| 1 | `main()` starts | `p=0, t=0, r=0, SI=0` |
| 2 | Create `Scanner` object | `p=0, t=0, r=0, SI=0` |

### Phase 2: Input
| Step | Prompt shown | User enters | Variable State |
|------|--------------|-------------|----------------|
| 3 | `Enter Principal:` | `1000` | `p=1000.0` |
| 4 | `Enter Time:` | `2` | `t=2.0` |
| 5 | `Enter Rate:` | `5` | `r=5.0` |

### Phase 3: Processing
| Step | Calculation | Variable State |
|------|-------------|----------------|
| 6 | `SI = (1000 * 2 * 5) / 100` | `SI=100.0` |

### Phase 4: Output
| Step | Console Output |
|------|----------------|
| 7 | `Simple Interest = 100.0` |

### Phase 5: End
| Step | Action |
|------|--------|
| 8 | `sc.close()` — program ends |

## Area of Circle — execution trace (sample input: r=7)

### Phase 1: Start & Declaration
| Step | Action | Variable State |
|------|--------|----------------|
| 1 | `main()` starts | `r=0, area=0.0` |
| 2 | Create `Scanner` object | `r=0, area=0.0` |

### Phase 2: Input
| Step | Prompt shown | User enters | Variable State |
|------|--------------|-------------|----------------|
| 3 | `Enter the radius of the circle` | `7` | `r=7` |

### Phase 3: Processing
| Step | Calculation | Variable State |
|------|-------------|----------------|
| 4 | `area = 3.14 * 7 * 7` | `area=153.86` |

### Phase 4: Output
| Step | Console Output |
|------|----------------|
| 5 | `Area of Circle:153.86` |

### Phase 5: End
| Step | Action |
|------|--------|
| 6 | `sc.close()` — program ends |

## Hello World — execution trace

| Phase | Step | Action | Console Output |
|-------|------|--------|----------------|
| 1. Start | 1 | `main()` starts | — |
| 2. Output | 2 | Print message | `Hello World!` |
| 3. End | 3 | Program ends | — |

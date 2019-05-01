package group3b.repository.impl;

import group3b.domain.Window;
import group3b.repository.WindowRepository;

import java.util.HashSet;
import java.util.Set;

public class WindowRepositoryImpl implements WindowRepository {

    private static WindowRepositoryImpl repository = null;
    private Set<Window> windows;

    private WindowRepositoryImpl(){
        this.windows = new HashSet<>();
    }

    public static WindowRepositoryImpl getRepository(){
        if (repository == null) repository = new WindowRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Window> getAll() {
        return this.windows;
    }

    @Override
    public Window create(Window window) {
        this.windows.add(window);
        return window;
    }

    @Override
    public Window update(Window window) {

        Window[] cloneOfWindows = windows.toArray(new Window[windows.size()]);
        for (int i = 0; i<cloneOfWindows.length;i++) {
            if (cloneOfWindows[i].equals(window)) {
                windows.remove(cloneOfWindows[i]);
            }
        }
        return create(window);
    }

    @Override
    public void delete(String windowId) {
        Window[] cloneOfWindows = windows.toArray(new Window[windows.size()]);
        for (int i = 0; i<cloneOfWindows.length;i++) {
            if (cloneOfWindows[i].getWindowId() == windowId) {
                if (windows.contains(cloneOfWindows[i])){
                    windows.remove(cloneOfWindows[i]);
                }
            }
        }
    }

    @Override
    public Window read(String windowId) {

        Window windowToReturn = null;

        Window[] cloneOfWindows = windows.toArray(new Window[windows.size()]);

        for (int i = 0; i<cloneOfWindows.length;i++) {
            if (cloneOfWindows[i].getWindowId() == windowId) {
                windowToReturn = cloneOfWindows[i];
            }
        }

        return windowToReturn;
    }
}